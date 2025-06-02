package com.ejemplo;

/**
 * Provides methods for applying discounts to monetary amounts.
 */
public class CalculadoraDescuentos {
  /**
   * Applies a percentage-based discount to a given amount.
   *
   * @param monto      the original amount
   * @param porcentaje the discount percentage to apply (must be between 0 and 100)
   * @return the amount after applying the discount, or 0 if the percentage is invalid (> 100)
   */
  public static double aplicarDescuentoPorcentaje(double monto, double porcentaje) {
    if (porcentaje > 100) {
      return 0;
    }
    return monto - (monto * porcentaje / 100);
  }

  /**
   * Applies a fixed discount to a given amount.
   *
   * @param monto     the original amount
   * @param descuento the fixed discount amount to subtract
   * @return the amount after applying the fixed discount
   */
  public static double aplicarDescuentoFijo(double monto, double descuento) {
    return monto - descuento;
  }

  /**
   * Returns a boolean indicating a sample operation result.
   * This method currently serves as a placeholder and always returns true.
   *
   * @return true as a placeholder result
   */
  public static boolean otroMetodo() {
    return true;
  }
}