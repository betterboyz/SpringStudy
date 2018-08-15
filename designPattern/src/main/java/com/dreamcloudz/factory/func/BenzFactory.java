package com.dreamcloudz.factory.func;


import com.dreamcloudz.factory.Benz;
import com.dreamcloudz.factory.Car;

public class BenzFactory implements Factory {

  @Override
  public Car getCar() {
    return new Benz();
  }

}
