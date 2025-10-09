(ns sicp-clj.ch-2.2-17
  (:require [sicp-clj.ch-2.list :refer [car, cdr]]))

(defn last-pair [list]
  (defn last-it [l]
    (let [rest (cdr l)]
      (if (empty? rest)
        (car l)
        (last-it rest))))
  (last-it list))

(last-pair (list 23 72 149 34))
