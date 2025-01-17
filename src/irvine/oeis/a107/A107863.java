package irvine.oeis.a107;
// manually triselect

import irvine.oeis.SkipSequence;
import irvine.oeis.triangle.TriangleSelector;

/**
 * A107863 Column 1 of triangle A107862; a(n) = binomial(n*(n+1)/2 + n, n).
 * @author Georg Fischer
 */
public class A107863 extends SkipSequence {

  /** Construct the sequence. */
  public A107863() {
    super(new TriangleSelector(0, new A107862(), 0, n -> new int[] {n, 1}), 1);
  }
}

