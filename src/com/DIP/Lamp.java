package com.DIP;
public class Lamp implements ButtonClient {
  public void on() {
    System.out.println("Lighting up...");
  }

  public void off() {
    System.out.println("Turning off...");
  }
}
