(ns sicp-clj.ch-2.2-22
  (:require [sicp-clj.utils.math :refer [square]]
            [sicp-clj.ch-2.list :refer [car, cdr]]))

(defn square-list [items]
  (defn iter [things answer]
    (if (empty? things)
      answer
      (iter (cdr things)
            (cons (square (car things))
                  answer))))
  (iter items nil))
;; (square-list (list 1 2 3 4))
;; (iter '(1 2 3 4) nil)
;; (iter '(2 3 4) (cons 1 nil))
;; (iter '(2 3 4) '(1))
;; (iter '(3 4) (cons 4 '(1)))
;; (iter '(3 4) '(4 1))
;; ...

(defn square-list-1 [items]
  (defn iter [things answer]
    (if (empty? things)
     answer
     (iter (cdr things)
           (cons answer
                 ;; it's not even a list!
                 (square
                  (car things))))))
  (iter items nil))
