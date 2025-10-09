(ns sicp-clj.ch-2.list)

(def one-through-four (list 1 2 3 4))
(println one-through-four)

(defn car [items]
  (first items))

(defn cdr [items]
  (rest items))

(def squares (list 1 4 9 16 25))
(def odds (list 1 3 5 7 9))

(defn list-ref [items n]
  (if (zero? n)
    (car items)
    (list-ref (cdr items) (dec n))))

;; (println (list-ref squares 0))
;; (println (list-ref odds 4))

(defn length [items]
  (if (empty? items)
    0
    (inc (length (cdr items)))))

(defn _length [items]
  (defn length-iter [items result]
    (if (empty? items)
      result
      (length-iter (cdr items)
          (inc result))))
  (length-iter items 0))

;; (println (length squares))
;; (println (length odds))

(defn append [list1 list2]
  (if (empty? list1)
    list2
    (cons (car list1) (append (cdr list1) list2))))

;; (println (append squares odds))
;; (println (append odds squares))
