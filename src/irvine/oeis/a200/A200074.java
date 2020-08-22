package irvine.oeis.a200;
// Generated by gen_seq4.pl holos [[0],[1104480,-2536856,669202,715258,-426062,79774,-4964],[394944,-209088,28788,756,-264],[-1751040,4065108,-1600230,-1038918,843522,-194646,14892],[640992,-1913392,722894,553604,-457234,114872,-9928],[842400,-1758552,1112826,218082,-459114,149970,-14892],[102816,-986908,1480412,-259048,-462964,212720,-24820],[-102816,72396,105210,-62028,7974],[-34272,-66172,11552,47597,-4009,-6913,1241]] [1,1,3,9,30,108,406,1577,6280] 0 at 2020-03-14 22:45
// Recurrence: (n+1)*(n+2)*(1241*n^4-10636*n^3+25417*n^2-7382*n-17136)*a[n+0]=-18*(n+1)*(443*n^3-3889*n^2+9734*n-5712)*a[n-1]+4*(6205*n^6-53180*n^5+115741*n^4+64762*n^3-370103*n^2+246727*n-25704)*a[n-2]+6*(2482*n^6-24995*n^5+76519*n^4-36347*n^3-185471*n^2+293092*n-140400)*a[n-3]+2*(4964*n^6-57436*n^5+228617*n^4-276802*n^3-361447*n^2+956696*n-320496)*a[n-4]-6*(2482*n^6-32441*n^5+140587*n^4-173153*n^3-266705*n^2+677518*n-291840)*a[n-5]+12*(n-4)*(2*n-11)*(11*n^2+73*n-748)*a[n-6]+2*(n-5)*(2*n-13)*(1241*n^4-5672*n^3+955*n^2+16508*n-8496)*a[n-7]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A200074 G.f. satisfies: A(x) = (1 + x*A(x)^2)*(1 + x^2*A(x)).
 * @author Georg Fischer
 */
public class A200074 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A200074() {
    super(0, "[[0],[1104480,-2536856,669202,715258,-426062,79774,-4964],[394944,-209088,28788,756,-264],[-1751040,4065108,-1600230,-1038918,843522,-194646,14892],[640992,-1913392,722894,553604,-457234,114872,-9928],[842400,-1758552,1112826,218082,-459114,149970,-14892],[102816,-986908,1480412,-259048,-462964,212720,-24820],[-102816,72396,105210,-62028,7974],[-34272,-66172,11552,47597,-4009,-6913,1241]]", "[1,1,3,9,30,108,406,1577,6280]", 0);
  }
}
