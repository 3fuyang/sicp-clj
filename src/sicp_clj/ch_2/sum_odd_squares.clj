(ns sicp-clj.ch-2.sum-odd-squares
  (:require [sicp-clj.ch-2.list :refer [car, cdr, append]]
            [sicp-clj.ch-2.accumulate :refer [accumulate]]
            [sicp-clj.utils.math :refer [square]]))

(defn enumerate-tree [tree]
  (cond (number? tree) (list tree)
        (empty? tree) nil
        :else (append
               (enumerate-tree (car tree))
               (enumerate-tree (cdr tree)))))

(defn sum-odd-squares [tree]
  (accumulate
   +
   0
   (map square
        (filter
         odd?
         (enumerate-tree tree)))))

(println "sum-odd-squares" (sum-odd-squares (list 1 (list 2 (list 3 4)) 5)))
