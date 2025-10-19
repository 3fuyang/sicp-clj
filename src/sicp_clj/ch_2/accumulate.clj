(ns sicp-clj.ch-2.accumulate
  (:require [sicp-clj.ch-2.list :refer [car, cdr]]))

(defn accumulate [op init seq]
  (if (empty? seq) init
      (op (car seq)
          (accumulate op
                      init
                      (cdr seq)))))

(println (accumulate + 0 (list 1 2 3 4 5)))
(println (accumulate * 1 (list 1 2 3 4 5)))
(println (accumulate cons nil (list 1 2 3 4 5)))
