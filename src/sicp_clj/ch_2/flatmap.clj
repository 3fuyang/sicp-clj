(ns sicp-clj.ch-2.flatmap
  (:require [sicp-clj.ch-2.accumulate :refer [accumulate]]
            [sicp-clj.ch-2.list :refer [append]]))

(defn flatmap "proc takes a single value and returns a list of values" [proc seq]
  (accumulate append
              nil
              (map proc seq)))

(println (flatmap (fn [x] (list x (- x))) (list 1 2 3 4 5)))
