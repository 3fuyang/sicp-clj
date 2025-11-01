(ns sicp-clj.ch-2.2-42
  (:require [sicp-clj.ch-2.flatmap :refer [flatmap]]
            [sicp-clj.ch-2.enumerate-interval :refer [enumerate-interval]]))

(def empty-board '())

(defn make-position [row col]
  (list row col))

(defn adjoin-position [row col board]
  (cons (make-position row col) board))

(defn get-row [position]
  (first position))

(defn safe? "not same row, col or diagonal with other queens" [_col positions]
  (let [row1 (get-row (first positions))]
    (defn helper [rest-of-queens cols-apart]
      (or (empty? rest-of-queens)
          (let [row2 (get-row (first rest-of-queens))]
            (and (not (= row1 row2))
                 (not (= row1 (- row2 cols-apart)))
                 (not (= row1 (+ row2 cols-apart)))
                 (helper (rest rest-of-queens) (inc cols-apart))))))
    (helper (rest positions) 1)))

(defn queens [board-size]
  (defn queen-cols [k]
    (if (= k 0)
      (list empty-board)
      (filter
       (fn [positions]            ;; filter out those that are not safe
         (safe? k positions))
       (flatmap                   ;; generates all the possible positions for the k-th queen
        (fn [rest-of-queens]
          (map (fn [new-row]
                 (adjoin-position
                  new-row
                  k
                  rest-of-queens))
               (enumerate-interval
                1
                board-size)))
        (queen-cols (- k 1))))))
  (queen-cols board-size))

(defn slow-queens [board-size]
  (defn queen-cols [k]
    (if (= k 0)
      (list empty-board)
      (filter
       (fn [positions]
         (safe? k positions))
       (flatmap
        (fn [new-row] ;; the order of the nested mappings in the flatmap interchanged
          (map (fn [rest-of-queens]
                 (adjoin-position
                  new-row k rest-of-queens))
               (queen-cols (- k 1))))
        (enumerate-interval 1 board-size)))))
  (queen-cols board-size))

(println (queens 6))
