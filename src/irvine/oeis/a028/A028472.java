package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A028472 Number of perfect matchings in graph P_{10} X P_{n}.
 * @author Sean A. Irvine
 */
public class A028472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028472() {
    super(new long[] {-1, -1, 285, -411, -18027, 20689, 472275, -271027, -6149853, 471319, 42303393, 10402780, -157353820, -58545372, 335484428, 123321948, -429447820, -123321948, 335484428, 58545372, -157353820, -10402780, 42303393, -471319, -6149853, 271027, 472275, -20689, -18027, 411, 285, 1},
      new Z[] {
        Z.ONE,
        Z.ONE,
        new Z("89"),
        new Z("571"),
        new Z("18061"),
        new Z("185921"),
        new Z("4213133"),
        new Z("53175517"),
        new Z("1031151241"),
        new Z("14479521761"),
        new Z("258584046368"),
        new Z("3852472573499"),
        new Z("65743732590821"),
        new Z("1012747193318519"),
        new Z("16848161392724969"),
        new Z("264499788583572499"),
        new Z("4337452956682508609"),
        new Z("68829675768134027209"),
        new Z("1119577238373960926141"),
        new Z("17874911934649249360651"),
        new Z("289415868852204573601981"),
        new Z("4636763679433683366608896"),
        new Z("74879006808407274130739093"),
        new Z("1202001705294409565628321437"),
        new Z("19382410440110542337234925061"),
        new Z("311484337184180075276922600623"),
        new Z("5018509108124737957886255150633"),
        new Z("80700697009502007037287976940453"),
        new Z("1299598794744411682074630028692673"),
        new Z("20905825647867487665415951375532161"),
        new Z("336575314603876110364700686838155709"),
        new Z("5415373740576031834124627622504057037"),
      });
  }
}
