package irvine.oeis.a068;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a003.A003415;


/**
 * A068346 a(n) = n'' = second arithmetic derivative of n.
 * Formula: <code>a(n) = A003415(A003415(n)).</code>
 * @author Georg Fischer
 */
public class A068346 extends NestedSequence {

  /** Construct the sequence. */
  public A068346() {
    super(0, new A003415(), new A003415(), 0, 0); 
  }

}
