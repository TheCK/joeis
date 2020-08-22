package irvine.oeis.a192;
// Generated by gen_seq4.pl holos [[0],[1237289607540,-2914355808270,2902654982850,-1586519204800,514438689375,-99040215625,10489546875,-471765625],[4990381235280,-12452695983648,13170715000632,-7661594367032,2649555357792,-545083250384,61802816880,-2980652960],[5966710283520,-16388382723840,19037983570944,-12127897966304,4576843366464,-1023512060384,125628272640,-6531349760],[1892093437440,-6419404313856,8925780446976,-6624774973696,2846944978176,-711183869440,95954880000,-5410585600],[0,72116342784,-196555364352,209062684672,-113023967232,33110499328,-5019371520,309176320]] [1,1,4,38,444,5805] 0 at 2020-03-14 22:45
// Recurrence: 2048*(n-3)*(n-2)*(n-1)*n*(150965*n^3-1545075*n^2+5236171*n-5868843)*a[n+0]=256*(n-3)*(n-2)*(n-1)*(21135100*n^4-248013150*n^3+1057496990*n^2-1920941631*n+1231831665)*a[n-1]+32*(n-3)*(n-2)*(204104680*n^5-2905360120*n^4+16233323207*n^3-44427578447*n^2+59458979970*n-31076616060)*a[n-2]+8*(n-3)*(372581620*n^6-6607607250*n^5+48312584548*n^4-186256666080*n^3+398929297639*n^2-449551482162*n+207932551470)*a[n-3]+5*(5*n-21)*(5*n-19)*(5*n-18)*(5*n-17)*(150965*n^3-1092180*n^2+2598916*n-2026782)*a[n-4]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A192947 G.f. satisfies: A(x) = 1 + x*Sum_{n&gt;=0} (A(x)^4 - 1)^n.
 * @author Georg Fischer
 */
public class A192947 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A192947() {
    super(0, "[[0],[1237289607540,-2914355808270,2902654982850,-1586519204800,514438689375,-99040215625,10489546875,-471765625],[4990381235280,-12452695983648,13170715000632,-7661594367032,2649555357792,-545083250384,61802816880,-2980652960],[5966710283520,-16388382723840,19037983570944,-12127897966304,4576843366464,-1023512060384,125628272640,-6531349760],[1892093437440,-6419404313856,8925780446976,-6624774973696,2846944978176,-711183869440,95954880000,-5410585600],[0,72116342784,-196555364352,209062684672,-113023967232,33110499328,-5019371520,309176320]]", "[1,1,4,38,444,5805]", 0);
  }
}
