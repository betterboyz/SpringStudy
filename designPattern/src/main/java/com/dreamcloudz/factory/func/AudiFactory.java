package com.dreamcloudz.factory.func;


import com.dreamcloudz.factory.Audi;
import com.dreamcloudz.factory.Car;

public class AudiFactory implements Factory {

  @Override
  public Car getCar() {
    return new Audi();
  }

}
