package irvine.oeis.a123;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A123016 a(1)=1, a(2)=1, a(3)=4, a(4)=0; a(n)=12a(n-2)-16a(n-3) for n&gt;=5.
 * @author Georg Fischer
 */
public class A123016 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123016() {
    super(new long[] {8L, -2L}, new long[] {1L, 4L}, 1L);
  } // constructor()
} // A123016
