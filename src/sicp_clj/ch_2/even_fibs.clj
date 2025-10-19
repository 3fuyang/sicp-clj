(ns sicp-clj.ch-2.even-fibs
  (:require [sicp-clj.ch-2.accumulate :refer [accumulate]]
            [sicp-clj.ch-1.fibonacci :refer [fib]]))

(defn enumerate-interval [low high]
  (if (> low high) nil
      (cons low
            (enumerate-interval
             (+ low 1)
             high))))

(defn even-fibs [n]
  (accumulate
   cons
   nil
   (filter
    even?
    (map fib (enumerate-interval 0 n)))))

(println "even-fibs" (even-fibs 10))
