(ns sicp-clj.ch-2.2-40
  (:require [sicp-clj.ch-2.enumerate-interval :refer [enumerate-interval]])
  (:require [sicp-clj.ch-2.flatmap :refer [flatmap]]))

(defn unique-pairs "generates the sequence of pairs (i, j) with 1 <= j < i <= n" [n]
  (flatmap (fn [i]
              (map (fn [j]
                     (list i j))
              (enumerate-interval 1 (dec i))))
            (enumerate-interval 1 n)))

(println (unique-pairs 6))
