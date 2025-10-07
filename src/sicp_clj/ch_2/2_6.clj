(ns sicp-clj.ch-2.2-6)

(defn zero [_f]
  (fn [x]
    x))

(defn add-1 [n]
  (fn [f]
    (fn [x]
      (f ((n f) x)))))

(defn one [f]
  (fn [x]
      (f x)))

(defn two [f]
  (fn [x]
    (f (f x))))

(defn add "isn't this simply a stack visualizer?" [a b]
  (fn [f]
    (fn [x]
      ((a f) ((b f) x)))))

(defn church-num [n]
  ((n (fn [x] (+ x 1))) 0))

(println (church-num zero))
(println (church-num one))
(println (church-num two))
(println (church-num (add one two)))
