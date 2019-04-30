package irvine.oeis.a000;

import irvine.oeis.PartialSumSequence;

/**
 * A000070 <code>a(n) = Sum_{k=0..n} p(k)</code> where <code>p(k) =</code> number of partitions of k (A000041).
 * @author Sean A. Irvine
 */
public class A000070 extends PartialSumSequence {

  /** Construct the sequence. */
  public A000070() {
    super(new A000041());
  }
}

