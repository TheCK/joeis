package irvine.oeis.a277;
// Generated by gen_seq4.pl holos at 2021-08-16 19:34

import irvine.oeis.HolonomicRecurrence;
/**
 * A277618 Lexicographically earliest nonnegative sequence such that |a(n+1)-a(n)| is a prime number, and no number occurs twice; a(0) = 0.
 * radtorec(x*(2*x^4+2*x^3-3*x^2+2*x+2)/(x-1)^2/(x^4+x^3+x^2+x+1))
 * @author Georg Fischer
 */
public class A277618 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A277618() {
    super(0, "[[0],[-16, 2],[-10, 2],[16,-3],[-3, 2],[3, 2],[21,-2],[15,-2],[-11, 3],[8,-2],[2,-2]]", "[0, 2, 4, 1, 3, 5, 7, 9, 6, 8, 10, 12]", 0);
  }
}
