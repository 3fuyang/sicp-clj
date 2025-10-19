(ns sicp-clj.ch-2.2-26
  (:require [sicp-clj.ch-2.list :refer [append]]
            [sicp-clj.utils.pair :refer [my-cons]]))

(def x (list 1 2 3))
(def y (list 4 5 6))

;; (1 2 3 4 5 6)
(println (append x y))
;; equivalent to ((1 2 3) (4 5 6))
(println (my-cons x y))
;; ((1 2 3) (4 5 6))
(println (list x y))
