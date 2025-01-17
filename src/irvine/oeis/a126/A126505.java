package irvine.oeis.a126;
// Generated by gen_seq4.pl holos at 2021-10-05 14:59

import irvine.oeis.HolonomicRecurrence;
/**
 * A126505 Number of base 10 n-digit numbers with adjacent digits differing by four or less.
 * x^10-10*x^9+15*x^8+40*x^7-35*x^6-42*x^5+28*x^4+16*x^3-9*x^2-2*x+1
 * @author Georg Fischer
 */
public class A126505 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A126505() {
    super(0, "[[0],[1],[-2],[-9],[16],[28],[-42],[-35],[40],[15],[-10],[1]]", "[1, 10, 70, 510, 3720, 27142, 198034, 1444904, 10542368, 76919662, 561224422]", 0);
  }
}
