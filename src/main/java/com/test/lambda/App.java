package com.test.lambda;

import com.amazonaws.services.lambda.runtime.Context;

import java.util.HashMap;
import java.util.Map;


/**
 * Hello world!
 *
 */
public class App 
{


   public String myHandler(Map<String,Object> input, Context context) {
       return "LA VARIABLE TEST_AVL est:- " + System.getenv("TEST_AVL");
   }

}
