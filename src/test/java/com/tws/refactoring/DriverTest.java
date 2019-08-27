package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class DriverTest {
@Test
    void should_return_age(){
    //given
    Driver driver = new Driver(15);
    //when
    driver.setAge(18);
    //then
    Assertions.assertEquals(18,driver.getAge());

}
}
