(ns sicp-clj.ch-2.prime-sum-pairs
  (:require [sicp-clj.ch-2.flatmap :refer [flatmap]]
            [sicp-clj.ch-2.enumerate-interval :refer [enumerate-interval]]
            [sicp-clj.ch-1.prime :refer [prime?]]
            [sicp-clj.ch-2.list :refer [car, cadr]]))

(defn prime-sum? [pair]
  (prime? (+ (car pair) (cadr pair))))

(defn make-pair-sum "emits a triple consisting of the numbers in the pair and their sum" [pair]
  (list (car pair)
        (cadr pair)
        (+ (car pair) (cadr pair))))

(defn prime-sum-pairs [n]
  (map make-pair-sum
       (filter prime-sum?
               (flatmap
                (fn [i]
                  (map (fn [j]
                         (list i j))
                       (enumerate-interval 1 (dec i))))
                (enumerate-interval 1 n)))))

(println (prime-sum-pairs 6))
