(ns sicp-clj.ch-2.product-of-squares-of-odd-elements
  (:require [sicp-clj.ch-2.accumulate :refer [accumulate]]
            [sicp-clj.utils.math :refer [square]]))

(defn product-of-squares-of-odd-elements [sequence]
  (accumulate
   *
   1
   (map square (filter odd? sequence))))

(println "product-of-squares-of-odd-elements" (product-of-squares-of-odd-elements (list 1 2 3 4 5)))
