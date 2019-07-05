#!/bin/bash
#
# Attempt to automatically fix a bunch of style problems in the code for
# the OEIS.  This is necessarily conservative.

find src/irvine/oeis -name "A[0-9][0-9][0-9][0-9][0-9][0-9].java" | while read s; do
    sed -e 's/Z\.valueOf(0L\?)/Z.ZERO/g' \
        -e 's/Z\.valueOf(1L\?)/Z.ONE/g' \
        -e 's/Z\.valueOf(2L\?)/Z.TWO/g' \
        -e 's/Z\.valueOf(3L\?)/Z.THREE/g' \
        -e 's/Z\.valueOf(4L\?)/Z.FOUR/g' \
        -e 's/Z\.valueOf(5L\?)/Z.FIVE/g' \
        -e 's/Z\.valueOf(6L\?)/Z.SIX/g' \
        -e 's/Z\.valueOf(7L\?)/Z.SEVEN/g' \
        -e 's/Z\.valueOf(8L\?)/Z.EIGHT/g' \
        -e 's/Z\.valueOf(9L\?)/Z.NINE/g' \
        -e 's/Z\.valueOf(10L\?)/Z.TEN/g' \
        -e 's/Z\.valueOf(-1L\?)/Z.NEG_ONE/g' \
        <"${s}" >"${s}.t"
    if cmp -s "${s}" "${s}.t" >&/dev/null; then
        /bin/rm "${s}.t"
    else
        mv "${s}.t" "${s}"
        echo "Modified ${s}"
    fi
done