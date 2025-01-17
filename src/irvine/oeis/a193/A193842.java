package irvine.oeis.a193;
// Generated by gen_seq4.pl trigf 1 1, -1, -4, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A193842 Triangular array: the fission of the polynomial sequence ((x+1)^n: n &gt;= 0) by the polynomial sequence ((x+2)^n: n &gt;= 0). (Fission is defined at Comments.).
 * @author Georg Fischer
 */
public class A193842 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A193842() {
    super(0, new long[] {1}, new long[] {1, -1, -4, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
