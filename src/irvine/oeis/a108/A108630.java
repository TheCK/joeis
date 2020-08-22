package irvine.oeis.a108;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1+x-sqrt(1-2*x-7*x^2-8*x^3-4*x^4))/(2+2*x+2*x^2)
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A108630 G.f.: (1+x-sqrt(1-2*x-7*x^2-8*x^3-4*x^4))/(2+2*x+2*x^2).
 * @author Georg Fischer
 */
public class A108630 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A108630() {
    super(1, "[[0],[0,8,8],[96,144,48],[738,632,134],[2352,1468,232],[4392,2168,272],[5292,2147,221],[4194,1424,122],[2022,575,41],[390,89,5],[-126,-32,-2],[-90,-19,-1]]", "[1,1,2,6,17,54,178,606,2116,7533,27242,99799]", 10);
  }
}
