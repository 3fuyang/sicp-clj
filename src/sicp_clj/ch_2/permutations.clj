(ns sicp-clj.ch-2.permutations
  (:require [sicp-clj.ch-2.flatmap :refer [flatmap]]))

(defn my-remove [x s]
  (filter (fn [y]
            (not (= x y)))
          s))

(defn permutations [s]
  (if (empty? s)
      (list nil)
      (flatmap (fn [x]
                 (map (fn [p]
                        (cons x p))
                      (permutations (my-remove x s))))
               s)))

(println (permutations (list 1 2 3 4)))
