package behavioral.Strategy_opt1;

import java.util.function.IntUnaryOperator;

enum EBillingStrategy {
  NORMAL ( a -> a),
  HAPPY_HOUR ( a -> a/2),
  ;
  
  private final IntUnaryOperator strategy;
  
  EBillingStrategy( IntUnaryOperator strategy) {
    this.strategy = strategy;
  }
  
  int getActPrice( int rawPrice) {
    return this.strategy.applyAsInt( rawPrice);
  }
}
