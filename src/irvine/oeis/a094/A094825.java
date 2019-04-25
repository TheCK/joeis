package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094825 Number of (s(0), s(1), <code>...,</code> s(2n)) such that <code>0 &lt;</code> s(i) <code>&lt; 10</code> and |s(i) - s(i-1)| <code>= 1</code> for <code>i = 1,2,....,2n,</code> s(0) <code>= 1,</code> s(2n) <code>= 7</code>.
 * @author Sean A. Irvine
 */
public class A094825 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094825() {
    super(new long[] {-5, 20, -21, 8}, new long[] {1, 7, 35, 153});
  }
}
