package lambdas;

@FunctionalInterface
public interface Calculo {

  double executar (double a, double b);

  default String legal() {
    return "Legal!";
  }
  static String muitoLegal() {
    return "Muito Legal!";
  }

  // Na FunctionalInterface pode ter apenas um método abstrato, mas pode ter métodos default e statics
}
