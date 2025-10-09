(ns sicp-clj.ch-2.map
  (:require [sicp-clj.ch-2.list :refer [car, cdr]]))

(defn my-map [proc items]
  (if (empty? items)
    nil
    (cons (proc (car items))
          (cdr items))))
