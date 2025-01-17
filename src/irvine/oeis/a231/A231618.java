package irvine.oeis.a231;
// Generated by gen_seq4.pl holos [[0],[10206,-32805,24867,-5022],[-2268,7830,-7704,2232],[0,-1143,2783,-1426],[0,-90,-28,62]] [1,8,92,1264] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A231618 G.f. satisfies: A(x) = (1 + 3*x*A(x))^2 * (3 + A(x)) / 4.
 * @author Georg Fischer
 */
public class A231618 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A231618() {
    super(0, "[[0],[10206,-32805,24867,-5022],[-2268,7830,-7704,2232],[0,-1143,2783,-1426],[0,-90,-28,62]]", "[1,8,92,1264]", 0);
  }
}
