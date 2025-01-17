package irvine.oeis.a107;
// manually triselect

import irvine.oeis.SkipSequence;
import irvine.oeis.triangle.TriangleSelector;

/**
 * A107886 Column 1 of triangle A107884.
 * @author Georg Fischer
 */
public class A107886 extends SkipSequence {

  /** Construct the sequence. */
  public A107886() {
    super(new TriangleSelector(0, new A107884(), 0, n -> new int[] {n, 1}), 1);
  }
}

