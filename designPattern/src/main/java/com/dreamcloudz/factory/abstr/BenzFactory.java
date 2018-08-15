package com.dreamcloudz.factory.abstr;


import com.dreamcloudz.factory.Benz;
import com.dreamcloudz.factory.Car;

public class BenzFactory extends AbstractFactory {

  @Override
  public Car getCar() {
    return new Benz();
  }

}
