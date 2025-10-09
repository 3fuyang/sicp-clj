(ns sicp-clj.ch-2.2-21
  (:require [sicp-clj.utils.math :refer [square]]
            [sicp-clj.ch-2.list :refer [car, cdr]]
            [sicp-clj.ch-2.map :refer [my-map]]))

(defn square-list-1 [items]
  (if (empty? items)
    nil
    (cons (square (car items))
          (square-list-1 (cdr items)))))

(defn square-list-2 [items]
  (my-map square items))
