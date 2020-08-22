package irvine.oeis.a218;
// Generated by gen_seq4.pl holos [[0],[-620784,71856,2186856,-1788154,157494,211934,-62886,4964],[302400,-424080,223320,-52620,5100,-120],[799632,119376,-3489048,3203850,-554166,-344814,143982,-14892],[236304,746784,-2257080,1762766,-351900,-159082,81096,-9928],[-425520,806976,235608,-1257162,633126,73962,-99306,14892],[-162000,-465120,1100088,681878,-1049448,82022,128280,-24820],[28080,-277200,173352,41070,-44796,7206],[123120,-201240,-126888,123890,36231,-22639,-2691,1241]] [1,2,5,15,48,160,550,1937,6954] 0 at 2020-03-14 22:45
// Recurrence: (n+2)*(n+3)*(1241*n^5-8896*n^4+14395*n^3+17632*n^2-50640*n+20520)*a[n+0]=-6*(n+2)*(1201*n^4-9868*n^3+26581*n^2-24270*n+2340)*a[n-1]+2*(12410*n^7-64140*n^6-41011*n^5+524724*n^4-340939*n^3-550044*n^2+232560*n+81000)*a[n-2]-6*(2482*n^7-16551*n^6+12327*n^5+105521*n^4-209527*n^3+39268*n^2+134496*n-70920)*a[n-3]+2*(4964*n^7-40548*n^6+79541*n^5+175950*n^4-881383*n^3+1128540*n^2-373392*n-118152)*a[n-4]+6*(2482*n^7-23997*n^6+57469*n^5+92361*n^4-533975*n^3+581508*n^2-19896*n-133272)*a[n-5]+60*(n-5)*(2*n-7)*(n^3-34*n^2+132*n-144)*a[n-6]-2*(n-6)*(2*n-9)*(1241*n^5-2691*n^4-8779*n^3+19851*n^2-1570*n-5748)*a[n-7]
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A218251 G.f. satisfies: A(x) = (1 + x*A(x))^2 * (1 + x^3*A(x)).
 * @author Georg Fischer
 */
public class A218251 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A218251() {
    super(0, "[[0],[-620784,71856,2186856,-1788154,157494,211934,-62886,4964],[302400,-424080,223320,-52620,5100,-120],[799632,119376,-3489048,3203850,-554166,-344814,143982,-14892],[236304,746784,-2257080,1762766,-351900,-159082,81096,-9928],[-425520,806976,235608,-1257162,633126,73962,-99306,14892],[-162000,-465120,1100088,681878,-1049448,82022,128280,-24820],[28080,-277200,173352,41070,-44796,7206],[123120,-201240,-126888,123890,36231,-22639,-2691,1241]]", "[1,2,5,15,48,160,550,1937,6954]", 0);
  }
}
