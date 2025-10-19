(ns sicp-clj.ch-2.2-24
  (:require [sicp-clj.ch-2.count-leaves :refer [count-leaves]]
            [sicp-clj.utils.pair :refer [my-cons]]))

(println (count-leaves (my-cons 1 (my-cons 2 (my-cons 3 4)))))
