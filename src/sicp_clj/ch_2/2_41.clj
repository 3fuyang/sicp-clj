(ns sicp-clj.ch-2.2-41
  (:require [sicp-clj.ch-2.flatmap :refer [flatmap]]
            [sicp-clj.ch-2.enumerate-interval :refer [enumerate-interval]]))

;; it's not efficient from a performance perspective
;; but i guess that's not what fp cares about
(defn ordered-triples
  "generates the sequence of ordered triples (i, j, k)
   with i, j, k <= n (each one distinct)
   and i + j + k = sum"
  [n sum]
  (filter (fn [triple]
            (= (reduce + triple) sum))
          (flatmap (fn [i]
                     (flatmap (fn [j]
                                (map (fn [k]
                                       (list i j k))
                                     (enumerate-interval 1 (dec j))))
                              (enumerate-interval 1 (dec i))))
                   (enumerate-interval 1 n))))

(println (ordered-triples 10 10))
