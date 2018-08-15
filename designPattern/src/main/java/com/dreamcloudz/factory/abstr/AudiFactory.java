package com.dreamcloudz.factory.abstr;


import com.dreamcloudz.factory.Audi;
import com.dreamcloudz.factory.Car;

//具体的业务逻辑封装
public class AudiFactory extends AbstractFactory {

  @Override
  public Car getCar() {
    return new Audi();
  }

}

