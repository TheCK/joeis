package irvine.oeis.a082;
// Generated by gen_seq4.pl finifull at 2020-01-25 12:34
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A082622 a(1) = 3, a(n) = smallest palindromic prime obtained by inserting two paired digits anywhere in a(n-1).
 * @author Georg Fischer
 */
public class A082622 extends FiniteSequence {

  /** Construct the sequence. */
  public A082622() {
    super(Z.THREE, new Z("131"), new Z("10301"), new Z("1003001"), new Z("100030001"), new Z("10070307001"), new Z("1000703070001"), new Z("100075030570001"), new Z("10006750305760001"), new Z("1000167503057610001"), new Z("100015675030576510001"), new Z("10001056750305765010001"), new Z("1000105367503057635010001"), new Z("100001053675030576350100001"), new Z("10000105360750305706350100001"), new Z("1000010513607503057063150100001"), new Z("100001005136075030570631500100001"), new Z("10000100513607503330570631500100001"), new Z("1000010025136075033305706315200100001"));
  }
}
