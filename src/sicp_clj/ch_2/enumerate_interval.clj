(ns sicp-clj.ch-2.enumerate-interval
  (:require [sicp-clj.ch-2.list :refer [car, cdr, append]]
            [sicp-clj.ch-2.accumulate :refer [accumulate]]
            [sicp-clj.utils.math :refer [square]]
            [sicp-clj.ch-1.fibonacci :refer [fib]]))

(defn enumerate-interval [low high]
  (if (> low high) nil
      (cons low
            (enumerate-interval
             (+ low 1)
             high))))

(println "enumerate-interval" (enumerate-interval 2 7))

(defn enumerate-tree "why empty? does not accept numbers?!" [tree]
  (cond (number? tree) (list tree)
        (empty? tree) nil
        :else (append
               (enumerate-tree (car tree))
               (enumerate-tree (cdr tree)))))

(println "enumerate-tree" (enumerate-tree (list 1 (list 2 (list 3 4)) 5)))

(defn sum-odd-squares [tree]
  (accumulate
   +
   0
   (map square
        (filter
         odd?
         (enumerate-tree tree)))))

(println "sum-odd-squares" (sum-odd-squares (list 1 (list 2 (list 3 4)) 5)))

(defn even-fibs [n]
  (accumulate
   cons
   nil
   (filter
    even?
    (map fib (enumerate-interval 0 n)))))

(println "even-fibs" (even-fibs 10))

(defn list-fib-squares "constructs a list of the squares of the first n+1
 Fibonacci numbers" [n]
  (accumulate
   cons
   nil
   (map square
        (map fib
             (enumerate-interval 0 n)))))

(println "list-fib-squares" (list-fib-squares 10))

(defn product-of-squares-of-odd-elements [sequence]
  (accumulate 
   *
   1
   (map square (filter odd? sequence))))

(println "product-of-squares-of-odd-elements" (product-of-squares-of-odd-elements (list 1 2 3 4 5)))
