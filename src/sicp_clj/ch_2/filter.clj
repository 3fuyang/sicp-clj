(ns sicp-clj.ch-2.filter
  (:require [sicp-clj.ch-2.list :refer [car, cdr]]))

(defn my-filter [pred seq]
  (cond (empty? seq) nil
        (pred (car seq)) (cons (car seq)
                                         (my-filter pred
                                                    (cdr seq)))
        :else (my-filter pred (cdr seq))))

(println (my-filter odd? (list 1 2 3 4 5)))
