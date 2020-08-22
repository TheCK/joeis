package irvine.oeis.a187;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: -8x^5*(630x^18+10620x^17+153525x^16+1211058x^15+6621390x^14+24647178x^13+66958554x^12+133891418x^11+202680754x^10+232634698x^9+204008900x^8+135332502x^7+67245306x^6+24326718x^5+6174582x^4+1024222x^3+99344x^2+4466x+55)/((x-1)^15*(x+1)^9)
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A187239 Number of ways to place 7 nonattacking bishops on an n X n board.
 * @author Georg Fischer
 */
public class A187239 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A187239() {
    super(1, "[0,0,0,0,0,440,35728,794752,8193776,49396656,194613744,537962448,1082660016,1632071200,1861077584,1621446032,1071131344,535668432,197177424,52971120,9688464,1228200,84960,5040]", "[1,-6,6,34,-84,-42,322,-162,-603,708,540,-1260,0,1260,-540,-708,603,162,-322,42,84,-34,-6,6,-1]");
  }
}
