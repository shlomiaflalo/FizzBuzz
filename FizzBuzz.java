# FizzBuzz
FizzBuzz Solution



package com.Pirple;

        public class FizzBuzz {

            public static void main(String[] args) {


                for (int i = 1; i <= 100; i++) {

                    if (!((i % 3 == 0) || (i % 5 == 0))) {

                        System.out.print(" " + i + " ");

                    }

                    if ((i % i == 0) && (i % 1 == 0))

                        System.out.print(" prime ");


                    if (i % 5 == 0 && i % 3 == 0) {

                        System.out.print(" FizzBuzz ");

                    }

                    else if(i%3==0) {

                        System.out.print(" Fizz ");


                    } else if(i%5==0) {
                        System.out.print(" Buzz ");

                    }

                    if (i % 10 == 0) {
                        System.out.println();
                        System.out.println();

                    }


                }

            }}
