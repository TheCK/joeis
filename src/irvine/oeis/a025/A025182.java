package irvine.oeis.a025;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a014.A014533;

/**
 * A025182 <code>a(n) =</code> number of <code>(s(0), s(1)</code>, ..., <code>s(n))</code> such that <code>s(i)</code> is an integer, <code>s(0) = 0, |s(1)| = 1, |s(i) - s(i-1)| &lt;= 1</code> for i <code>&gt;= 2, s(n) = 4</code>. Also <code>a(n) = T(n,n-4)</code>, where T is the array defined in <code>A025177</code>.
 * @author Sean A. Irvine
 */
public class A025182 extends DifferenceSequence {

  /** Construct the sequence. */
  public A025182() {
    super(new PrependSequence(new A014533(), 0));
  }
}