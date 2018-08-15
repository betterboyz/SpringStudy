package com.dreamcloudz.factory.abstr;


import com.dreamcloudz.factory.Bmw;
import com.dreamcloudz.factory.Car;

public class BmwFactory extends AbstractFactory {

  @Override
  public Car getCar() {
    return new Bmw();
  }

}
