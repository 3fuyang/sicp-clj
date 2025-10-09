(ns sicp-clj.ch-2.2-18
  (:require [sicp-clj.ch-2.list :refer [car, cdr]]))

(defn my-reverse [list]
  (defn reverse-helper [l rs]
    (if (empty? l)
      rs
      (reverse-helper (cdr l)
                      (cons (car l) rs))))
  (reverse-helper list nil))

(reverse (list 1 4 9 16 25))
