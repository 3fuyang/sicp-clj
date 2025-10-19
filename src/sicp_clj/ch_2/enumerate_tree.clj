(ns sicp-clj.ch-2.enumerate-tree
  (:require [sicp-clj.ch-2.list :refer [car, cdr, append]]))

(defn enumerate-tree "why empty? does not accept numbers?!" [tree]
  (cond (number? tree) (list tree)
        (empty? tree) nil
        :else (append
               (enumerate-tree (car tree))
               (enumerate-tree (cdr tree)))))

(println "enumerate-tree" (enumerate-tree (list 1 (list 2 (list 3 4)) 5)))
