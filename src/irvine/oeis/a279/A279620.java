package irvine.oeis.a279;
// Generated by gen_seq4.pl morfix   1->122, 2->12 at 2019-07-19 19:57
// DO NOT EDIT here!

import irvine.oeis.MorphismSequence;

/**
 * A279620 Limit of the sequence of words defined by <code>w(1) = 1, w(2) = 1221</code>, and <code>w(n) = w(n-1) 2 w(n-2) 2 w(n-1)</code> for <code>n &gt;= 2</code>. Also the fixed point of the map <code>1 -&gt; 122, 2 -&gt; 12</code>.
 * @author Georg Fischer
 */
public class A279620 extends MorphismSequence {

  /** Construct the sequence. */
  public A279620() {
    super(1, "", "", "1->122, 2->12");
  }
}