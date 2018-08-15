package com.dreamcloudz.factory.func;


import com.dreamcloudz.factory.Bmw;
import com.dreamcloudz.factory.Car;

public class BmwFactory implements Factory {

  @Override
  public Car getCar() {
    return new Bmw();
  }

}
