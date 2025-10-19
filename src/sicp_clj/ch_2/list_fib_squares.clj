(ns sicp-clj.ch-2.list-fib-squares
  (:require [sicp-clj.ch-2.accumulate :refer [accumulate]]
            [sicp-clj.utils.math :refer [square]]
            [sicp-clj.ch-1.fibonacci :refer [fib]]))

(defn enumerate-interval [low high]
  (if (> low high) nil
      (cons low
            (enumerate-interval
             (+ low 1)
             high))))

(defn list-fib-squares "constructs a list of the squares of the first n+1
 Fibonacci numbers" [n]
  (accumulate
   cons
   nil
   (map square
        (map fib
             (enumerate-interval 0 n)))))

(println "list-fib-squares" (list-fib-squares 10))
